package org.springframework.beans.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaou
 * @date 2024/1/23
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }
}
