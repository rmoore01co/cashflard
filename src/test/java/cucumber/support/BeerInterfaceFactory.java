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
package cucumber.support;

public class BeerInterfaceFactory {


    // using environment variables
    public static BeerInterface createBeerInterface() {
        String cucumberEnvironment = System.getenv("CUCUMBER_ENVIRONMENT");
        if ("DEVELOPMENT".equals(cucumberEnvironment)) {
            return new BeerProgrammaticInterface();
        }
        else {
            return new BeerUserInterface();
        }
    }

    // using tagged hooks
    private static boolean bypassUI = false;

    public static void bypassUI() {
        bypassUI = true;
    }

    public static void reset() {
        bypassUI = false;
    }
//    public static BeerInterface createBeerInterface() {
//        if (bypassUI) {
//            return new BeerProgrammaticInterface();
//        }
//        else {
//            return new BeerUserInterface();
//        }
//    }
}
