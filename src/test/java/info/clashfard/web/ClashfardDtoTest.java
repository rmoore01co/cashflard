/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package info.clashfard.web;

import info.clashfard.web.dto.ClashfardDto;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;

public class ClashfardDtoTest {

    final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<clashfard>\n" +
            "    <id>1</id>\n" +
            "    <name>My Name</name>\n" +
            "    <description>My Description</description>\n" +
            "</clashfard>\n";

    @Test
    public void testObjectMarshalling() throws JAXBException
    {
        final ClashfardDto dto = new ClashfardDto();
        dto.setId(1L);
        dto.setName("My Name");
        dto.setDescription("My Description");

        final JAXBContext jaxbContext = JAXBContext.newInstance(ClashfardDto.class);
        final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        final StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(dto, sw);

        assertEquals(xml, sw.toString());
    }

    @Test
    public void testObjectUnmarshalling() throws JAXBException
    {
        final JAXBContext jaxbContext = JAXBContext.newInstance(ClashfardDto.class);

        final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        final ClashfardDto dto = (ClashfardDto) jaxbUnmarshaller.unmarshal(new StringReader(xml));

        assertEquals(1L, dto.getId());
        assertEquals("My Name", dto.getName());
        assertEquals("My Description", dto.getDescription());
    }
}
