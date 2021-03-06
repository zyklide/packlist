
/*
 * PackList is an open-source packing-list for Android
 *
 * Copyright (c) 2016 Nicolas Bossard and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Model related classes for PackList.
 *
 * @author Nicolas BOSSARD
 */
package com.nbossard.packlist.model;

/*

============================== DIAGRAMS OF CLASS ==================================

// To generate graphics please use jar available at :
//     http://sourceforge.net/projects/plantuml/files/plantuml.jar/download
// syntax description can be found at :
//     http://plantuml.sourceforge.net/classes.html
//     http://www.linux-france.org/prj/edu/archinet/DA/fiche-uml-relations/fiche-uml-relations.html
@startuml
    package com.nbossard.packlist.model #LightBlue {
        !include Item.java
        !include ItemComparatorAdditionDate.java
        !include ItemComparatorAlphabetical.java
        !include ItemComparatorCategoryAlphabetical.java
        !include ItemComparatorPacking.java
        !include ScoredItem.java
        !include SortModes.java
        !include Trip.java
        !include TripItem.java
        !include TripFormatter.java

        com.nbossard.packlist.model.TripItem "1" --* "*" com.nbossard.packlist.model.Trip
        Comparator <|.. com.nbossard.packlist.model.ItemComparatorAdditionDate
        Comparator <|.. com.nbossard.packlist.model.ItemComparatorAlphabetical
        Comparator <|.. com.nbossard.packlist.model.ItemComparatorPacking
        Comparator <|.. com.nbossard.packlist.model.ItemComparatorCategoryAlphabetical
    }
@enduml

*/
