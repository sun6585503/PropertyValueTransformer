//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.08.27 时间 11:35:16 PM CST 
//


package com.jerrysun.transformer.profile.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MappingElement" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PropertyMapping" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ValueMapping" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="SourceValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="TargetValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SourceKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TargetKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mappingElement"
})
@XmlRootElement(name = "Mapping")
public class Mapping {

    @XmlElement(name = "MappingElement", required = true)
    protected List<Mapping.MappingElement> mappingElement;

    /**
     * Gets the value of the mappingElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappingElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappingElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mapping.MappingElement }
     * 
     * 
     */
    public List<Mapping.MappingElement> getMappingElement() {
        if (mappingElement == null) {
            mappingElement = new ArrayList<Mapping.MappingElement>();
        }
        return this.mappingElement;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PropertyMapping" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ValueMapping" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="SourceValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="TargetValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SourceKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TargetKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "propertyMapping"
    })
    public static class MappingElement {

        @XmlElement(name = "PropertyMapping", required = true)
        protected List<Mapping.MappingElement.PropertyMapping> propertyMapping;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the propertyMapping property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propertyMapping property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropertyMapping().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Mapping.MappingElement.PropertyMapping }
         * 
         * 
         */
        public List<Mapping.MappingElement.PropertyMapping> getPropertyMapping() {
            if (propertyMapping == null) {
                propertyMapping = new ArrayList<Mapping.MappingElement.PropertyMapping>();
            }
            return this.propertyMapping;
        }

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ValueMapping" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="SourceValue" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="TargetValue" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SourceKey" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TargetKey" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "valueMapping"
        })
        public static class PropertyMapping {

            @XmlElement(name = "ValueMapping", required = true)
            protected List<Mapping.MappingElement.PropertyMapping.ValueMapping> valueMapping;
            @XmlAttribute(name = "SourceKey")
            protected String sourceKey;
            @XmlAttribute(name = "TargetKey")
            protected String targetKey;

            /**
             * Gets the value of the valueMapping property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the valueMapping property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getValueMapping().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Mapping.MappingElement.PropertyMapping.ValueMapping }
             * 
             * 
             */
            public List<Mapping.MappingElement.PropertyMapping.ValueMapping> getValueMapping() {
                if (valueMapping == null) {
                    valueMapping = new ArrayList<Mapping.MappingElement.PropertyMapping.ValueMapping>();
                }
                return this.valueMapping;
            }

            /**
             * 获取sourceKey属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceKey() {
                return sourceKey;
            }

            /**
             * 设置sourceKey属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceKey(String value) {
                this.sourceKey = value;
            }

            /**
             * 获取targetKey属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetKey() {
                return targetKey;
            }

            /**
             * 设置targetKey属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetKey(String value) {
                this.targetKey = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="SourceValue" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="TargetValue" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ValueMapping {

                @XmlAttribute(name = "SourceValue")
                protected String sourceValue;
                @XmlAttribute(name = "TargetValue")
                protected String targetValue;

                /**
                 * 获取sourceValue属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSourceValue() {
                    return sourceValue;
                }

                /**
                 * 设置sourceValue属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSourceValue(String value) {
                    this.sourceValue = value;
                }

                /**
                 * 获取targetValue属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetValue() {
                    return targetValue;
                }

                /**
                 * 设置targetValue属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetValue(String value) {
                    this.targetValue = value;
                }

            }

        }

    }

}

