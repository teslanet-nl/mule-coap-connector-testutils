/*******************************************************************************
 * Copyright (c) 2019 (teslanet.nl) Rogier Cobben.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License - v 2.0 
 * which accompanies this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    (teslanet.nl) Rogier Cobben - initial creation
 ******************************************************************************/
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
