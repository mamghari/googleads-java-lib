// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdUnitAfcSizeError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdUnitAfcSizeError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="DOESNT_FIT"/>
 *     &lt;enumeration value="NOT_APPLICABLE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdUnitAfcSizeError.Reason")
@XmlEnum
public enum AdUnitAfcSizeErrorReason {


    /**
     * 
     *                 The supplied Afc size is not valid.
     *               
     * 
     */
    INVALID,

    /**
     * 
     *                 The supplied {@link AdUnit} size does not fit into any of the Afc sizes
     *                 specified by the ad unit's {@link AdSenseSettings}.
     *               
     * 
     */
    DOESNT_FIT,

    /**
     * 
     *                 The supplied Afc size is not applicable for the {@link AdUnit}. This
     *                 should only be set on the root {@link AdUnit}.
     *               
     * 
     */
    NOT_APPLICABLE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdUnitAfcSizeErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
