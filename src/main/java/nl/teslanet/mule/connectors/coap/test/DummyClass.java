/*-
 * #%L
 * Mule CoAP Connector Test Utilities
 * %%
 * Copyright (C) 2019 - 2020 (teslanet.nl) Rogier Cobben
 * 
 * Contributors:
 *     (teslanet.nl) Rogier Cobben - initial creation
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */
package nl.teslanet.mule.connectors.coap.test;


/**
 * Class that does nothing, really. 
 * Its purpose is that the artifact is not empty, to satisfy the build process.
 *
 */
public class DummyClass
{
    /**
     * A property.
     */
    private int dummyValue;

    public DummyClass( int val )
    {
        dummyValue= val;
    }

    /**
     * @return the dummyValue
     */
    public int getDummyValue()
    {
        return dummyValue;
    }

    /**
     * @param dummyValue the dummyValue to set
     */
    public void setDummyValue( int dummyValue )
    {
        this.dummyValue= dummyValue;
    }

}
