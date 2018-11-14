/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2018 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.models;

import javax.annotation.Nullable;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Interface for a generic container item, used by the {@link Tabs} and {@link Carousel} models.
 *
 * @since com.adobe.cq.wcm.core.components.models 13.0.0
 */
@ConsumerType
public interface ContainerItem {

    /**
     * Name of the resource property that defines the container item title
     *
     * @since com.adobe.cq.wcm.core.components.models 13.0.0
     */
    String PN_PANEL_TITLE = "cq:panelTitle";

    /**
     * Returns the title of this {@code ContainerItem}.
     *
     * @return the title of this container item or {@code null}
     * @since com.adobe.cq.wcm.core.components.models 13.0.0
     */
    @Nullable
    default String getTitle() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the name of this {@code ContainerItem}.
     *
     * @return the container item name or {@code null}
     * @since com.adobe.cq.wcm.core.components.models 13.0.0
     */
    @Nullable
    default String getName() {
        throw new UnsupportedOperationException();
    }
}