//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.25 at 05:48:09 PM CEST 
//


package es.rickyepoderi.wbxml.bind.wvcsp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userID",
    "screenName",
    "groupID"
})
@XmlRootElement(name = "AddList")
public class AddList {

    @XmlElement(name = "UserID")
    protected List<UserID> userID;
    @XmlElement(name = "ScreenName")
    protected List<ScreenName> screenName;
    @XmlElement(name = "GroupID")
    protected List<GroupID> groupID;

    /**
     * Gets the value of the userID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserID }
     * 
     * 
     */
    public List<UserID> getUserID() {
        if (userID == null) {
            userID = new ArrayList<UserID>();
        }
        return this.userID;
    }

    /**
     * Gets the value of the screenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the screenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScreenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScreenName }
     * 
     * 
     */
    public List<ScreenName> getScreenName() {
        if (screenName == null) {
            screenName = new ArrayList<ScreenName>();
        }
        return this.screenName;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupID }
     * 
     * 
     */
    public List<GroupID> getGroupID() {
        if (groupID == null) {
            groupID = new ArrayList<GroupID>();
        }
        return this.groupID;
    }

}
