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
package info.clashfard.domain;

public class Clashfard {

	private Clashfard() {}

	private long id;
	private String name;
	private String description;

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public static Builder clashfard() {
		return new Builder();
	}

	public static class Builder {
		private Clashfard clashfard = new Clashfard();

		private Builder() {

		}
		public Builder withId(final long id) {
			clashfard.id = id;
			return this;
		}
		public Builder withName(final String name) {
			clashfard.name = name;
			return this;
		}
		public Builder withDescription(final String desc) {
			clashfard.description = desc;
			return this;
		}
		public Clashfard build() {
			return clashfard;
		}

	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final Clashfard clashfard = (Clashfard) o;

		return new org.apache.commons.lang3.builder.EqualsBuilder()
				.append(id, clashfard.id)
				.append(name, clashfard.name)
				.append(description, clashfard.description)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
				.append(id)
				.append(name)
				.append(description)
				.toHashCode();
	}

	@Override
	public String toString() {
		return "Clashfard{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
