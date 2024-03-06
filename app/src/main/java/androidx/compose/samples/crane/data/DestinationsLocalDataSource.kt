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
            imageUrl = "https://www.equinoxmagazine.fr/wp-content/uploads/2022/04/Cuisine-plats-manger-nourriture-repas-espagnol-Photo-iStock.jpg"
        ),
        ExploreModel(
            city = PARIS,
            description = "Dîner français raffiné",
            imageUrl = "https://resize.elle.fr/original/var/plain_site/storage/images/elle-a-table/les-dossiers-de-la-redaction/dossier-de-la-redac/menu-gastronomique/88780110-1-fre-FR/Comment-faire-un-menu-gastronomique.jpg"
        ),
        ExploreModel(
            city = TOKYO,
            description = "Délices japonais en hauteur",
            imageUrl = "https://www.terres-japonaises.com/app/media/26/files/2016/06/sushi-japon.jpg"
        ),
        ExploreModel(
            city = SYDNEY,
            description = "Vue panoramique sur Sydney",
            imageUrl = "https://www.australia-australie.com/wp-content/uploads/2016/11/Lamington.jpg"
        ),
        ExploreModel(
            city = NEWYORK,
            description = "Expérience culinaire au sommet de New York",
            imageUrl = "https://www.expedia.fr/stories/wp-content/uploads/2021/06/24343-share-image.jpg"
        ),
        ExploreModel(
            city = ISTANBUL,
            description = "Dîner avec vue à Istanbul",
            imageUrl = "https://recettes.de/images/blogs/street-food-cuisine-du-monde/galette-lavash-pour-doner-kebab-turquie-grece-armenie.640x480.jpg"
        ),
        ExploreModel(
            city = ROME,
            description = "Cuisine italienne au-dessus de Rome",
            imageUrl = "https://www.leboulangerparisien.com/wp-content/uploads/2021/03/cuisine-italinne-.jpg.webp"
        ),
        ExploreModel(
            city = LONDON,
            description = "Dégustation britannique avec vue",
            imageUrl = "https://actufood.fr/wp-content/uploads/2023/02/specialites-anglaises.png"
        ),
        ExploreModel(
            city = BEIJING,
            description = "Haute cuisine chinoise à Pékin",
            imageUrl = "https://www.thefork.fr/blog/s3/files/styles/lightbox_content/public/2023-04/repas%20chine-iStock-545286388.jpg?itok=l7pIroJd"
        ),
        ExploreModel(
            city = CAIRO,
            description = "Dîner égyptien en hauteur au Caire",
            imageUrl = "https://www.voyageegypte.fr/cdn/eg-public/kushari_egypte_shutterstock_1100204009-MAX-w1000h600.jpg"
        ),
        ExploreModel(
            city = MEXICOCITY,
            description = "Saveurs mexicaines à Mexico",
            imageUrl = "https://blog.altiplano-voyage.com/wp-content/uploads/2017/03/tacos_plat_fotolia.jpg"
        ),
        ExploreModel(
            city = MOSCOW,
            description = "Cuisine russe au sommet de Moscou",
            imageUrl = "https://blog.chapkadirect.fr/wp-content/uploads/2018/11/AdobeStock_231219051.jpeg"
        ),
        ExploreModel(
            city = DELHI,
            description = "Expérience culinaire à Delhi",
            imageUrl = "https://images.restopolitan.com/restaurant/new-dehli/308178/Detail.jpg"
        ),
        ExploreModel(
            city = CAPE_TOWN,
            description = "Dîner panoramique au Cap",
            imageUrl = "https://www.touristsecrets.com/wp-content/uploads/2019/07/main-23-1.jpg"
        ),
        ExploreModel(
            city = BUENOS_AIRES,
            description = "Savourez Buenos Aires en hauteur",
            imageUrl = "https://www.authenticfoodquest.com/wp-content/uploads/2022/05/1200_BuenosAiresFoods_AuthenticFoodQuest.jpg"
        ),
        ExploreModel(
            city = TORONTO,
            description = "Vue spectaculaire de Toronto",
            imageUrl = "https://frenchradar.b-cdn.net/wp-content/uploads/2021/04/poutine-specialite-canada-frites.jpg"
        ),
        ExploreModel(
            city = DUBAI,
            description = "Dîner exquis avec vue à Dubaï",
            imageUrl = "https://a.cdn-hotels.com/gdcs/production15/d862/ba76ea15-df7f-4afa-a803-94e62326e22c.jpg"
        ),
        ExploreModel(
            city = SINGAPORE,
            description = "Cuisine singapourienne en hauteur",
            imageUrl = "https://ns.clubmed.com/FEAM/Marketing/Omnichannel/SEO/LPOTHERS/GS-1219/GettyImages-492095676.jpg"
        ),
        ExploreModel(
            city = MUMBAI,
            description = "Dîner avec panorama à Mumbai",
            imageUrl = "https://blog.courrierinternational.com/bombay-darling/wp-content/uploads/sites/39/2020/02/Post-9-street-food-vada-pao.jpg"
        ),
        ExploreModel(
            city = LOSANGELES,
            description = "Au sommet du ciel de Los Angeles",
            imageUrl = "https://a.cdn-hotels.com/gdcs/production0/d1513/35c1c89e-408c-4449-9abe-f109068f40c0.jpg"
        )
    ).map { it.copy(description = " ${((1..100).shuffled().first())} Restaurants") }

    val craneHotels = listOf(
        ExploreModel(
            city = MADRID,
            description = "Hôtel de luxe avec vue panoramique sur Madrid",
            imageUrl = "https://images.unsplash.com/photo-1539037116277-4db20889f2d4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = PARIS,
            description = "Élégant hôtel au cœur de Paris",
            imageUrl = "https://images.unsplash.com/photo-1502602898657-3e91760cbb34?q=80&w=1473&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = TOKYO,
            description = "Hôtel de charme offrant une vue imprenable sur Tokyo",
            imageUrl = "https://images.unsplash.com/photo-1503899036084-c55cdd92da26?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = SYDNEY,
            description = "Hôtel moderne avec vue sur le port de Sydney",
            imageUrl = "https://images.unsplash.com/photo-1549180030-48bf079fb38a?q=80&w=1527&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = NEWYORK,
            description = "Luxueux hôtel au sommet de Manhattan",
            imageUrl = "https://images.unsplash.com/photo-1518391846015-55a9cc003b25?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = ISTANBUL,
            description = "Hôtel élégant offrant une vue sur la mer à Istanbul",
            imageUrl = "https://images.unsplash.com/photo-1527838832700-5059252407fa?q=80&w=1598&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3DL"
        ),
        ExploreModel(
            city = ROME,
            description = "Hôtel historique avec vue sur les monuments de Rome",
            imageUrl = "https://images.unsplash.com/photo-1515542622106-78bda8ba0e5b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=$DEFAULT_IMAGE_WIDTH"
        ),
        ExploreModel(
            city = LONDON,
            description = "Hôtel de charme au cœur de Londres",
            imageUrl = "https://images.unsplash.com/photo-1526129318478-62ed807ebdf9?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3DL"
        ),
        ExploreModel(
            city = BEIJING,
            description = "Hôtel de luxe avec vue panoramique sur Pékin",
            imageUrl = "https://images.unsplash.com/photo-1599571234909-29ed5d1321d6?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = CAIRO,
            description = "Hôtel somptueux offrant une vue sur les pyramides du Caire",
            imageUrl = "https://images.unsplash.com/photo-1595979904086-471704dc0e81?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = MEXICOCITY,
            description = "Hôtel moderne avec une vue imprenable sur Mexico",
            imageUrl = "https://images.unsplash.com/photo-1568402102990-bc541580b59f?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = MOSCOW,
            description = "Hôtel de luxe au sommet de Moscou",
            imageUrl = "https://images.unsplash.com/photo-1513326738677-b964603b136d?q=80&w=1498&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = DELHI,
            description = "Hôtel élégant offrant une vue sur la ville de Delhi",
            imageUrl = "https://plus.unsplash.com/premium_photo-1661962487775-ad45f3a277e1?q=80&w=1469&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = CAPE_TOWN,
            description = "Hôtel de charme avec vue panoramique sur Le Cap",
            imageUrl = "https://images.unsplash.com/photo-1576485375217-d6a95e34d043?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = BUENOS_AIRES,
            description = "Hôtel sophistiqué offrant une vue sur Buenos Aires",
            imageUrl = "https://images.unsplash.com/photo-1610135206707-0f03e4800631?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = TORONTO,
            description = "Hôtel moderne au cœur de Toronto",
            imageUrl = "https://images.unsplash.com/photo-1503505129851-abaf7f6140b4?q=80&w=1527&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = DUBAI,
            description = "Hôtel de luxe avec vue sur la skyline de Dubaï",
            imageUrl = "https://images.unsplash.com/photo-1512453979798-5ea266f8880c?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = SINGAPORE,
            description = "Hôtel chic offrant une vue panoramique sur Singapour",
            imageUrl = "https://images.unsplash.com/photo-1555217851-6141535bd771?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = MUMBAI,
            description = "Hôtel contemporain avec vue sur la ville de Mumbai",
            imageUrl = "https://images.unsplash.com/photo-1610901706842-5fb2c3e88dd4?q=80&w=1527&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = LOSANGELES,
            description = "Hôtel élégant au sommet du ciel de Los Angeles",
            imageUrl = "https://images.unsplash.com/photo-1580655653885-65763b2597d0?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
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
            city = PARIS,
            description = "Vol direct - 1h 30m+",
            imageUrl = "https://images.unsplash.com/photo-1502602898657-3e91760cbb34?q=80&w=1473&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = TOKYO,
            description = "Vol direct - 11h 45m+",
            imageUrl = "https://images.unsplash.com/photo-1503899036084-c55cdd92da26?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = SYDNEY,
            description = "Vol direct - 14h 30m+",
            imageUrl = "https://images.unsplash.com/photo-1549180030-48bf079fb38a?q=80&w=1527&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = NEWYORK,
            description = "Vol direct - 7h 45m+",
            imageUrl = "https://images.unsplash.com/photo-1518391846015-55a9cc003b25?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = ISTANBUL,
            description = "Vol direct - 3h 30m+",
            imageUrl = "https://images.unsplash.com/photo-1527838832700-5059252407fa?q=80&w=1598&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3DL"
        ),
        ExploreModel(
            city = LONDON,
            description = "Vol direct - 1h 30m+",
            imageUrl = "https://images.unsplash.com/photo-1526129318478-62ed807ebdf9?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3DL"
        ),
        ExploreModel(
            city = BEIJING,
            description = "Vol direct - 9h 15m+",
            imageUrl = "https://images.unsplash.com/photo-1599571234909-29ed5d1321d6?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = CAIRO,
            description = "Vol direct - 5h 20m+",
            imageUrl = "https://images.unsplash.com/photo-1595979904086-471704dc0e81?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = MEXICOCITY,
            description = "Vol direct - 4h 45m+",
            imageUrl = "https://images.unsplash.com/photo-1568402102990-bc541580b59f?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = MOSCOW,
            description = "Vol direct - 3h 50m+",
            imageUrl = "https://images.unsplash.com/photo-1513326738677-b964603b136d?q=80&w=1498&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = DELHI,
            description = "Vol direct - 8h 30m+",
            imageUrl = "https://plus.unsplash.com/premium_photo-1661962487775-ad45f3a277e1?q=80&w=1469&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = CAPE_TOWN,
            description = "Vol direct - 11h 15m+",
            imageUrl = "https://images.unsplash.com/photo-1576485375217-d6a95e34d043?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = BUENOS_AIRES,
            description = "Vol direct - 14h 5m+",
            imageUrl = "https://images.unsplash.com/photo-1610135206707-0f03e4800631?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = TORONTO,
            description = "Vol direct - 7h 10m+",
            imageUrl = "https://images.unsplash.com/photo-1503505129851-abaf7f6140b4?q=80&w=1527&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = DUBAI,
            description = "Vol direct - 6h 40m+",
            imageUrl = "https://images.unsplash.com/photo-1512453979798-5ea266f8880c?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = SINGAPORE,
            description = "Vol direct - 12h 20m+",
            imageUrl = "https://images.unsplash.com/photo-1555217851-6141535bd771?q=80&w=1587&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = MUMBAI,
            description = "Vol direct - 10h 15m+",
            imageUrl = "https://images.unsplash.com/photo-1610901706842-5fb2c3e88dd4?q=80&w=1527&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        ),
        ExploreModel(
            city = LOSANGELES,
            description = "Vol direct - 10h 30m+",
            imageUrl = "https://images.unsplash.com/photo-1580655653885-65763b2597d0?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        )
    )
}
