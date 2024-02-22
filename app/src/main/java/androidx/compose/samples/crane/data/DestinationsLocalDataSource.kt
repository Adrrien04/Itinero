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
            city = NAPLES,
            description = "1286 Restaurants",
            imageUrl = "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?ixlib=rb-1.2.1&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = DALLAS,
            description = "2241 Restaurants",
            imageUrl = "https://images.unsplash.com/photo-1495749388945-9d6e4e5b67b1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = CORDOBA,
            description = "876 Restaurants",
            imageUrl = "https://images.unsplash.com/photo-1562625964-ffe9b2f617fc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=250&q=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = MADRID,
            description = "5610 Restaurants",
            imageUrl = "https://images.unsplash.com/photo-1515443961218-a51367888e4b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = MALDIVAS,
            description = "1286 Restaurants",
            imageUrl = "https://images.unsplash.com/flagged/photo-1556202256-af2687079e51?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = ASPEN,
            description = "2241 Restaurants",
            imageUrl = "https://images.unsplash.com/photo-1542384557-0824d90731ee?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = BALI,
            description = "876 Restaurants",
            imageUrl = "https://images.unsplash.com/photo-1567337710282-00832b415979?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = MADRID,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = PARIS,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TOKYO,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SYDNEY,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = NEWYORK,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ISTANBUL,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ROME,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LONDON,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BEIJING,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAIRO,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MEXICOCITY,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MOSCOW,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DELHI,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAPE_TOWN,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BUENOS_AIRES,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TORONTO,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DUBAI,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SINGAPORE,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MUMBAI,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LOSANGELES,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
    )

    val craneHotels = listOf(
        ExploreModel(
            city = MALDIVAS,
            description = "1286 Available Properties",
            imageUrl = "https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = ASPEN,
            description = "2241 Available Properties",
            imageUrl = "https://images.unsplash.com/photo-1445019980597-93fa8acb246c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = BALI,
            description = "876 Available Properties",
            imageUrl = "https://images.unsplash.com/photo-1570213489059-0aac6626cade?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),

        ExploreModel(
            city = NAPLES,
            description = "1286 Available Properties",
            imageUrl = "https://images.unsplash.com/photo-1455587734955-081b22074882?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = DALLAS,
            description = "2241 Available Properties",
            imageUrl = "https://images.unsplash.com/46/sh3y2u5PSaKq8c4LxB3B_submission-photo-4.jpg?ixlib=rb-1.2.1&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = CORDOBA,
            description = "876 Available Properties",
            imageUrl = "https://images.unsplash.com/photo-1570214476695-19bd467e6f7a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = MADRID,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = PARIS,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TOKYO,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SYDNEY,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = NEWYORK,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ISTANBUL,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ROME,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LONDON,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BEIJING,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAIRO,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MEXICOCITY,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MOSCOW,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DELHI,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAPE_TOWN,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BUENOS_AIRES,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TORONTO,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DUBAI,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SINGAPORE,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MUMBAI,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LOSANGELES,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
    )

    val craneDestinations = listOf(

        ExploreModel(
            city = MADRID,
            description = "Nonstop - 2h 12m+",
            imageUrl = "https://images.unsplash.com/photo-1539037116277-4db20889f2d4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = BALI,
            description = "Nonstop - 6h 20m+",
            imageUrl = "https://images.unsplash.com/photo-1518548419970-58e3b4079ab2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = ROME,
            description = "Nonstop - 2h 38m+",
            imageUrl = "https://images.unsplash.com/photo-1515542622106-78bda8ba0e5b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),

        ExploreModel(
            city = MALDIVAS,
            description = "Nonstop - 9h 24m+",
            imageUrl = "https://images.unsplash.com/photo-1544550581-5f7ceaf7f992?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),

        ExploreModel(
            city = NAPLES,
            description = "1286 Restaurants",
            imageUrl = "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?ixlib=rb-1.2.1&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = MADRID,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = PARIS,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TOKYO,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SYDNEY,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = NEWYORK,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ISTANBUL,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = ROME,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LONDON,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BEIJING,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAIRO,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MEXICOCITY,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MOSCOW,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DELHI,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = CAPE_TOWN,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = BUENOS_AIRES,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = TORONTO,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = DUBAI,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = SINGAPORE,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = MUMBAI,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
        ExploreModel(
            city = LOSANGELES,
            description = "Replace with the appropriate description",
            imageUrl = "Replace with the appropriate image URL"
        ),
    )
}
