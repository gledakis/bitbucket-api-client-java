/*
 * ClientUtilitiesTest
 * Copyright (C) 2015 Nishimura Software Studio
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.vx68k.bitbucket.api.client;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Collection of unit tests for {@link ClientUtilities}.
 *
 * @author Kaz Nishimura
 * @since 1.0
 */
@Ignore
public class ClientUtilitiesTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Ignore
    @Test
    public void testGetLogger() {
    }

    @Test
    public void testParseURL() throws MalformedURLException {
        URL url1 = ClientUtilities.parseURL(null);
        assertNull(url1);

        URL url2 = ClientUtilities.parseURL("https://api.bitbucket.org/");
        assertNotNull(url2);
    }

    @Ignore
    @Test
    public void testParseUUID() {
    }
}
