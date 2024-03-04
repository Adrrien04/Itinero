/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the Licenseat
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("ktlint:max-line-length") // String constants read better
package androidx.compose.samples.crane.data

import javax.inject.Inject
import javax.inject.Singleton

private const val DEFAULT_IMAGE_WIDTH = "250"

/**
 * Annotated with Singleton as the class created a lot of objects.
 */
@Singleton
class DestinationsLocalDataSource @Inject constructor() {
    val craneRestaurants = listOf(
        ExploreModel(
            city = MADRID,
            description = "Cuisine espagnole moderne",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = PARIS,
            description = "Dîner français raffiné",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TOKYO,
            description = "Délices japonais en hauteur",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SYDNEY,
            description = "Vue panoramique sur Sydney",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = NEWYORK,
            description = "Expérience culinaire au sommet de New York",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ISTANBUL,
            description = "Dîner avec vue à Istanbul",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ROME,
            description = "Cuisine italienne au-dessus de Rome",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LONDON,
            description = "Dégustation britannique avec vue",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BEIJING,
            description = "Haute cuisine chinoise à Pékin",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAIRO,
            description = "Dîner égyptien en hauteur au Caire",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MEXICOCITY,
            description = "Saveurs mexicaines à Mexico",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MOSCOW,
            description = "Cuisine russe au sommet de Moscou",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DELHI,
            description = "Expérience culinaire à Delhi",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAPE_TOWN,
            description = "Dîner panoramique au Cap",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BUENOS_AIRES,
            description = "Savourez Buenos Aires en hauteur",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TORONTO,
            description = "Vue spectaculaire de Toronto",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DUBAI,
            description = "Dîner exquis avec vue à Dubaï",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SINGAPORE,
            description = "Cuisine singapourienne en hauteur",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MUMBAI,
            description = "Dîner avec panorama à Mumbai",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LOSANGELES,
            description = "Au sommet du ciel de Los Angeles",
            imageUrl = "Replace with the appropriate image URL"
        )
    ).map { it.copy(description = " ${((1..100).shuffled().first())} Restaurants") }

    val craneHotels = listOf(
        ExploreModel(
            city = MADRID,
            description = "Hôtel de luxe avec vue panoramique sur Madrid",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = PARIS,
            description = "Élégant hôtel au cœur de Paris",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TOKYO,
            description = "Hôtel de charme offrant une vue imprenable sur Tokyo",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SYDNEY,
            description = "Hôtel moderne avec vue sur le port de Sydney",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = NEWYORK,
            description = "Luxueux hôtel au sommet de Manhattan",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ISTANBUL,
            description = "Hôtel élégant offrant une vue sur la mer à Istanbul",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ROME,
            description = "Hôtel historique avec vue sur les monuments de Rome",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LONDON,
            description = "Hôtel de charme au cœur de Londres",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BEIJING,
            description = "Hôtel de luxe avec vue panoramique sur Pékin",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAIRO,
            description = "Hôtel somptueux offrant une vue sur les pyramides du Caire",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MEXICOCITY,
            description = "Hôtel moderne avec une vue imprenable sur Mexico",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MOSCOW,
            description = "Hôtel de luxe au sommet de Moscou",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DELHI,
            description = "Hôtel élégant offrant une vue sur la ville de Delhi",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAPE_TOWN,
            description = "Hôtel de charme avec vue panoramique sur Le Cap",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BUENOS_AIRES,
            description = "Hôtel sophistiqué offrant une vue sur Buenos Aires",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TORONTO,
            description = "Hôtel moderne au cœur de Toronto",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DUBAI,
            description = "Hôtel de luxe avec vue sur la skyline de Dubaï",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SINGAPORE,
            description = "Hôtel chic offrant une vue panoramique sur Singapour",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MUMBAI,
            description = "Hôtel contemporain avec vue sur la ville de Mumbai",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LOSANGELES,
            description = "Hôtel élégant au sommet du ciel de Los Angeles",
            imageUrl = "Replace with the appropriate image URL"
        )
    ).map { it.copy(description = "Chambres disponibles : ${((1..100).shuffled().first())}") }


    val craneDestinations = listOf(
        ExploreModel(
            city = MADRID,
            description = "Vol direct - 2h 12m+",
            imageUrl = "https://images.unsplash.com/photo-1539037116277-4db20889f2d4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = BALI,
            description = "Vol direct - 6h 20m+",
            imageUrl = "https://images.unsplash.com/photo-1518548419970-58e3b4079ab2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = ROME,
            description = "Vol direct - 2h 38m+",
            imageUrl = "https://images.unsplash.com/photo-1515542622106-78bda8ba0e5b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),

        ExploreModel(
            city = MALDIVAS,
            description = "Vol direct - 9h 24m+",
            imageUrl = "https://images.unsplash.com/photo-1544550581-5f7ceaf7f992?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),

        ExploreModel(
            city = NAPLES,
            description = "Vol direct - 1h",
            imageUrl = "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?ixlib=rb-1.2.1&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = MADRID,
            description = "Vol direct - 2h 12m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = PARIS,
            description = "Vol direct - 1h 30m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TOKYO,
            description = "Vol direct - 11h 45m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SYDNEY,
            description = "Vol direct - 14h 30m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = NEWYORK,
            description = "Vol direct - 7h 45m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ISTANBUL,
            description = "Vol direct - 3h 30m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ROME,
            description = "Vol direct - 2h 38m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LONDON,
            description = "Vol direct - 1h 30m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BEIJING,
            description = "Vol direct - 9h 15m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAIRO,
            description = "Vol direct - 5h 20m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MEXICOCITY,
            description = "Vol direct - 4h 45m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MOSCOW,
            description = "Vol direct - 3h 50m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DELHI,
            description = "Vol direct - 8h 30m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAPE_TOWN,
            description = "Vol direct - 11h 15m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BUENOS_AIRES,
            description = "Vol direct - 14h 5m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TORONTO,
            description = "Vol direct - 7h 10m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DUBAI,
            description = "Vol direct - 6h 40m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SINGAPORE,
            description = "Vol direct - 12h 20m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MUMBAI,
            description = "Vol direct - 10h 15m+",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LOSANGELES,
            description = "Vol direct - 10h 30m+",
            imageUrl = "Replace with the appropriate image URL"
        )
    )
}