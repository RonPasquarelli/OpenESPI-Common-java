/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.08.27 at 01:43:57 PM EDT
//


package org.energyos.espi.common.models.atom;

import com.google.common.collect.Lists;

import org.energyos.espi.common.domain.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The Atom content construct is defined in section 4.1.3 of the format spec.
 * <p/>
 * <p/>
 * <p>Java class for contentType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="contentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/2005/Atom}commonAttributes"/>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="src" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement(name = "content")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentType", propOrder = {
        "usagePoint",
        "meterReading",
        "intervalBlocks",
        "electricPowerUsageSummary",
        "electricPowerQualitySummary",
        "readingType",
        "localTimeParameters",
        "applicationInformation",
        "authorization",
        "subscription",
        "retailCustomer",
        "content"
})
@XmlSeeAlso({
        MeterReading.class,
        UsagePoint.class,
        ElectricPowerUsageSummary.class,
        TimeConfiguration.class,
        ApplicationInformation.class,
        Authorization.class,
        Subscription.class,
        ElectricPowerQualitySummary.class,
        IntervalBlock.class,
        ReadingType.class,
        ApplicationInformation.class,
        Authorization.class,
        Subscription.class,
        RetailCustomer.class
})

public class ContentType {

    @XmlElementRefs({
            @XmlElementRef(name = "UsagePoint", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    protected UsagePoint usagePoint;

    @XmlElementRefs({
            @XmlElementRef(name = "MeterReading", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    protected MeterReading meterReading;

    
    @XmlElementRefs({
            @XmlElementRef(name = "IntervalBlock", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    protected List<IntervalBlock> intervalBlocks;

    @XmlElementRefs({
            @XmlElementRef(name = "ElectricPowerUsageSummary", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    protected ElectricPowerUsageSummary electricPowerUsageSummary;

    @XmlElementRefs({
            @XmlElementRef(name = "ElectricPowerQualitySummary", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    private ElectricPowerQualitySummary electricPowerQualitySummary;

    @XmlElementRefs({
            @XmlElementRef(name = "ReadingType", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    protected ReadingType readingType;

    @XmlElementRefs({
            @XmlElementRef(name = "LocalTimeParameters", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    private TimeConfiguration localTimeParameters;

    @XmlElementRefs({
        @XmlElementRef(name = "ApplicationInformation", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
     })
    @XmlAnyElement(lax = true)
    protected ApplicationInformation applicationInformation;

    @XmlElementRefs({
        @XmlElementRef(name = "Authorization", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
     })
    @XmlAnyElement(lax = true)
    protected Authorization authorization;

    @XmlElementRefs({
        @XmlElementRef(name = "Subscription", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
     })
    @XmlAnyElement(lax = true)
    protected Subscription subscription;

    // TODO note that the namespace here may be incorrect??
    @XmlElementRefs({
        @XmlElementRef(name = "RetailCustomer", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
     })
    @XmlAnyElement(lax = true)
    protected RetailCustomer retailCustomer;
    
    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;

    @XmlAttribute(name = "type")
    protected String type;

    @XmlAttribute(name = "src")
    @XmlSchemaType(name = "anyURI")
    protected String src;

    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    public UsagePoint getUsagePoint() {
        return usagePoint;
    }

    public void setUsagePoint(UsagePoint usagePoint) {
        this.usagePoint = usagePoint;
    }

    public MeterReading getMeterReading() {
        return meterReading;
    }

    public void setMeterReading(MeterReading meterReading) {
        this.meterReading = meterReading;
    }

    public List<IntervalBlock> getIntervalBlocks() {
        return intervalBlocks;
    }

    public void setIntervalBlocks(List<IntervalBlock> intervalBlocks) {
        this.intervalBlocks = intervalBlocks;
    }
    
    public ApplicationInformation getApplicationInformation() {
    	return this.applicationInformation;
    }
    
    public void setApplicationInformation(ApplicationInformation applicationInformation){
    	this.applicationInformation = applicationInformation;
    }

    public Authorization getAuthorization() {
    	return this.authorization;
    }
    public void setAuthorization(Authorization authorization){
    	this.authorization = authorization;
    }
    
    /**
     * The Atom content construct is defined in section 4.1.3 of the format spec.
     * Gets the value of the content property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link String }
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the src property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the base property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the lang property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * <p/>
     * <p/>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     * <p/>
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public RetailCustomer getRetailCustomer() {
    	return this.retailCustomer;
    }
    public void setRetailCustomer(RetailCustomer retailCustomer){
    	this.retailCustomer = retailCustomer;
    }

    public void setReadingType(ReadingType readingType) {
        this.readingType = readingType;
    }

    public ReadingType getReadingType() {
        return readingType;
    }

    public ElectricPowerUsageSummary getElectricPowerUsageSummary() {
        return electricPowerUsageSummary;
    }

    public void setElectricPowerUsageSummary(ElectricPowerUsageSummary electricPowerUsageSummary) {
        this.electricPowerUsageSummary = electricPowerUsageSummary;
    }

    public ElectricPowerQualitySummary getElectricPowerQualitySummary() {
        return electricPowerQualitySummary;
    }

    public void setElectricPowerQualitySummary(ElectricPowerQualitySummary electricPowerQualitySummary) {
        this.electricPowerQualitySummary = electricPowerQualitySummary;
    }
    
    public Subscription getSubscription() {
    	return this.subscription;
    }
    public void setSubscription(Subscription subscription){
    	this.subscription = subscription;
    }
    

    public TimeConfiguration getLocalTimeParameters() {
        return localTimeParameters;
    }

    public void setLocalTimeParameters(TimeConfiguration localTimeParameters) {
        this.localTimeParameters = localTimeParameters;
    }

    public IdentifiedObject getResource() {
        if (getUsagePoint() != null) {
            return getUsagePoint();
        } else if (getMeterReading() != null) {
            return getMeterReading();
        } else if (getLocalTimeParameters() != null) {
            return getLocalTimeParameters();
        } else if (getElectricPowerUsageSummary() != null) {
            return getElectricPowerUsageSummary();
        } else if (getElectricPowerQualitySummary() != null) {
            return getElectricPowerQualitySummary();
        } else if (getReadingType() != null) {
            return getReadingType();
        } else if (getApplicationInformation() != null) {
            return getApplicationInformation();
        } else if (getAuthorization() != null) {
            return getAuthorization();
        } else if (getSubscription() != null) {
            return getSubscription();
        }
        return null;
    }

    public List<IdentifiedObject> getResources() {
        List<IdentifiedObject> resources = new ArrayList<>();
        if (getResource() != null) {
            resources.add(getResource());
        } else {
            for (IntervalBlock intervalBlock : getIntervalBlocks())
                resources.add(intervalBlock);
        }
        return resources;
    }

    public void setResource(IdentifiedObject resource) {
        if (resource instanceof UsagePoint) {
            setUsagePoint((UsagePoint) resource);
        } else if (resource instanceof MeterReading) {
            setMeterReading((MeterReading) resource);
        } else if (resource instanceof TimeConfiguration) {
            setLocalTimeParameters((TimeConfiguration) resource);
        } else if (resource instanceof IntervalBlock) {
            setIntervalBlocks(Lists.newArrayList((IntervalBlock) resource));
        } else if (resource instanceof ElectricPowerUsageSummary) {
            setElectricPowerUsageSummary((ElectricPowerUsageSummary) resource);
        } else if (resource instanceof ElectricPowerQualitySummary) {
            setElectricPowerQualitySummary((ElectricPowerQualitySummary) resource);
        } else if (resource instanceof ReadingType) {
            setReadingType((ReadingType) resource);
        } else if (resource instanceof ApplicationInformation) {
        	setApplicationInformation((ApplicationInformation) resource);
        } else if (resource instanceof Authorization) {
        	setAuthorization((Authorization) resource);
        } else if (resource instanceof Subscription) {
        	setSubscription((Subscription) resource);
        }
    }

    @SuppressWarnings("unchecked")
    public void setResources(List<IdentifiedObject> identifiedObjects) {
        if (identifiedObjects == null)
            return;

        if (identifiedObjects.get(0) instanceof IntervalBlock) {
            List<IntervalBlock> intervalBlocks = (List<IntervalBlock>) (List<?>) identifiedObjects;
            setIntervalBlocks(intervalBlocks);
        } else {
            setResource(identifiedObjects.get(0));
        }
    }

	public TimeConfiguration getTimeConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Long getContentId(Class resourceClass) {
		// TODO its ugly right now, clean it up when templates are done
		Long result = 1L;
		if (this.getApplicationInformation() != null) {
			if (ApplicationInformation.class.equals(resourceClass)) {
				return this.getApplicationInformation().getId();				
			}
		}
		if (this.getAuthorization() != null) {
			if (Authorization.class.equals(resourceClass)) {
			    return this.getAuthorization().getId();
			}
		} 
		if (this.getElectricPowerQualitySummary() != null) {
			if (ElectricPowerQualitySummary.class.equals(resourceClass)) {
		    	return this.getElectricPowerQualitySummary().getId();
		  	}
	    }
		if (this.getElectricPowerUsageSummary() != null) {
			if (ElectricPowerUsageSummary.class.equals(resourceClass)) {
				return this.getElectricPowerUsageSummary().getId();
			}
		}
		if (this.getIntervalBlocks() != null) {
			// TODO this one is not right, but may not be needed??
			if (IntervalBlock.class.equals(resourceClass)) {
			    return this.getIntervalBlocks().get(0).getId();	
			}
		}
		if (this.getLocalTimeParameters() != null) {
			if (TimeConfiguration.class.equals(resourceClass)) {
				return this.getLocalTimeParameters().getId();
		    }
		}
		if (this.getMeterReading() != null) {
			if (MeterReading.class.equals(resourceClass)) {
				return this.getMeterReading().getId();
			}
		}
		if (this.getReadingType() != null) {
			if (ReadingType.class.equals(resourceClass)) {
				return this.getReadingType().getId();
			}
		}
		if (this.getRetailCustomer() != null) {
			if (RetailCustomer.class.equals(resourceClass)) {
				return this.getRetailCustomer().getId();
			}
		}
		if (this.getSubscription() != null) {
			if (Subscription.class.equals(resourceClass)) {
				return this.getSubscription().getId();
			}
		}		
		if (this.getUsagePoint() != null) {
			if (UsagePoint.class.equals(resourceClass)) {
				return this.getUsagePoint().getId();
			}
		}
		return result;
	}

	public String buildSelfHref(String hrefFragment) {
		// TODO its ugly right now, clean it up when templates are done
		String result = "";
		if (this.getApplicationInformation() != null) {
				return "/ApplicationInformation/" + this.getApplicationInformation().getId();				
		}
		if (this.getAuthorization() != null) {
			    return "/Authorization/" + this.getAuthorization().getId();
		} 
		if (this.getElectricPowerQualitySummary() != null) {
		    UsagePoint usagePoint = this.getElectricPowerQualitySummary().getUsagePoint();
		    RetailCustomer retailCustomer = usagePoint.getRetailCustomer();
		    	return "/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + usagePoint.getId() + "/ElectricPowerQualitySummary/" + this.getElectricPowerQualitySummary().getId();
	    }
		if (this.getElectricPowerUsageSummary() != null) {
			    UsagePoint usagePoint = this.getElectricPowerUsageSummary().getUsagePoint();
			    RetailCustomer retailCustomer = usagePoint.getRetailCustomer();
				return "/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + usagePoint.getId() + "/ElectricPowerUsageSummary/" + this.getElectricPowerUsageSummary().getId();
		}
		if (this.getIntervalBlocks() != null) {
			MeterReading meterReading = this.getIntervalBlocks().get(0).getMeterReading();
			UsagePoint usagePoint = meterReading.getUsagePoint();
			RetailCustomer retailCustomer = usagePoint.getRetailCustomer();
			return "/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + usagePoint.getId() + "/MeterReading/" + meterReading.getId() + "/IntervalBlock/" + this.getIntervalBlocks().get(0).getId();	
		}
		if (this.getLocalTimeParameters() != null) {
			UsagePoint usagePoint = this.getLocalTimeParameters().getUsagePoint();
			RetailCustomer retailCustomer = usagePoint.getRetailCustomer();
				return "/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + usagePoint.getId() + "/LocalTimeParameters/" + this.getLocalTimeParameters().getId();
		}
		if (this.getMeterReading() != null) {
			UsagePoint usagePoint = this.getMeterReading().getUsagePoint();
			RetailCustomer retailCustomer = usagePoint.getRetailCustomer();
				return "/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + usagePoint.getId() + "/MeterReading/" + this.getMeterReading().getId();
		}
		if (this.getReadingType() != null) {
			MeterReading meterReading = this.getReadingType().getMeterReading();
			UsagePoint usagePoint = meterReading.getUsagePoint();
			RetailCustomer retailCustomer = usagePoint.getRetailCustomer();
				return "/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + usagePoint.getId() + "/MeterReading/" + meterReading.getId() + "/ReadingType/" + this.getReadingType().getId();
		}
		if (this.getRetailCustomer() != null) {
				return "/RetailCustomer/" + this.getRetailCustomer().getId();
		}
		if (this.getSubscription() != null) {
				return "/Subscription/" + this.getSubscription().getId();
		
		}		
		if (this.getUsagePoint() != null) {
			RetailCustomer retailCustomer = this.getUsagePoint().getRetailCustomer();
				return "/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + this.getUsagePoint().getId();
		}
		return result;
	}

	public List<String> buildRelHref(String hrefFragment) {
		// TODO its ugly right now, clean it up when templates are done
		List<String> result = new ArrayList<String>();
		
		if (this.getApplicationInformation() != null) {
				return result;				
		}
		if (this.getAuthorization() != null) {
			    return result;
		} 
		if (this.getElectricPowerQualitySummary() != null) {
		    	return result;
	    }
		if (this.getElectricPowerUsageSummary() != null) {
	    	return result;
		}
		if (this.getIntervalBlocks() != null) {
	    	return result;
	    	}
		if (this.getLocalTimeParameters() != null) {
	    	return result;		}
		if (this.getMeterReading() != null) {
			UsagePoint usagePoint = this.getMeterReading().getUsagePoint();
			RetailCustomer retailCustomer = usagePoint.getRetailCustomer();
			ReadingType readingType = this.getMeterReading().getReadingType();
			result.add("/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + usagePoint.getId() + "/MeterReading/" + this.getMeterReading().getId() + "/IntervalBlock");
			result.add("/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + usagePoint.getId() + "/MeterReading/" + this.getMeterReading().getId() + "/ReadingType/" + readingType.getId());
	    	return result;		}
		if (this.getReadingType() != null) {
	    	return result;		}
		if (this.getRetailCustomer() != null) {
	    	return result;		}
		if (this.getSubscription() != null) {
	    	return result;		
		}		
		if (this.getUsagePoint() != null) {
			RetailCustomer retailCustomer = this.getUsagePoint().getRetailCustomer();
			TimeConfiguration timeConfiguration = this.getUsagePoint().getLocalTimeParameters();
			result.add("/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + this.getUsagePoint().getId() + "/MeterReading");
			result.add("/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + this.getUsagePoint().getId() + "/ElectricPowerQualitySummary");
			result.add("/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + this.getUsagePoint().getId() + "/ElectricPowerUsageSummary");
			result.add("/RetailCustomer/" + retailCustomer.getId() + "/UsagePoint/" + this.getUsagePoint().getId() + "/LocalTimeParameters/" + timeConfiguration.getId());
			return result;	
		}
		return result;
	}

}
