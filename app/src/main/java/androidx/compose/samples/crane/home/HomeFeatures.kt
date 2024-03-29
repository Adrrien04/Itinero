/*
 * Crane Search Content
 * Copyright 2020 The Android Open Source Project
 * Licensed under the Apache License, Version 2.0
 * https://www.apache.org/licenses/LICENSE-2.0
 */

package androidx.compose.samples.crane.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.samples.crane.R
import androidx.compose.samples.crane.base.SimpleUserInput
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun FlySearchContent(
    widthSize: WindowWidthSizeClass,
    datesSelected: String,
    searchUpdates: FlySearchContentUpdates
) {

    val columns = when (widthSize) {
        WindowWidthSizeClass.Compact -> 1
        WindowWidthSizeClass.Medium -> 2
        WindowWidthSizeClass.Expanded -> 4
        else -> 1
    }

    CraneSearch(columns) {
        // People user input
        item {
            PeopleUserInput(
                titleSuffix = ", Economy",
                onPeopleChanged = searchUpdates.onPeopleChanged
            )
        }

        item {
            FromDestination()
        }

        item {
            ToDestinationUserInput(
                onToDestinationChanged = searchUpdates.onToDestinationChanged
            )
        }

        item {
            DatesUserInput(
                datesSelected,
                onDateSelectionClicked = searchUpdates.onDateSelectionClicked
            )
        }
    }
}

@Composable
fun SleepSearchContent(
    widthSize: WindowWidthSizeClass,
    datesSelected: String,
    sleepUpdates: SleepSearchContentUpdates
) {

    val columns = when (widthSize) {
        WindowWidthSizeClass.Compact -> 1
        WindowWidthSizeClass.Medium -> 3
        WindowWidthSizeClass.Expanded -> 3
        else -> 1
    }

    // Display the Crane search UI
    CraneSearch(columns) {

        item {
            PeopleUserInput(onPeopleChanged = { sleepUpdates.onPeopleChanged })
        }

        item {
            DatesUserInput(
                datesSelected,
                onDateSelectionClicked = sleepUpdates.onDateSelectionClicked
            )
        }

        item {
            SimpleUserInput(
                caption = stringResource(R.string.input_select_location),
                vectorImageId = R.drawable.ic_hotel
            )
        }
    }
}

@Composable
fun EatSearchContent(
    widthSize: WindowWidthSizeClass,
    datesSelected: String,
    eatUpdates: EatSearchContentUpdates
) {
    // Determine the number of columns based on window width
    val columns = when (widthSize) {
        WindowWidthSizeClass.Compact -> 1
        WindowWidthSizeClass.Medium -> 2
        WindowWidthSizeClass.Expanded -> 4
        else -> 1
    }

    // Display the Crane search UI
    CraneSearch(columns) {
        // People user input
        item {
            PeopleUserInput(onPeopleChanged = eatUpdates.onPeopleChanged)
        }
        // Dates user input
        item {
            DatesUserInput(
                datesSelected,
                onDateSelectionClicked = eatUpdates.onDateSelectionClicked
            )
        }
        // Time user input for eat
        item {
            SimpleUserInput(
                caption = stringResource(R.string.input_select_time),
                vectorImageId = R.drawable.ic_time
            )
        }
        // Location user input for eat
        item {
            SimpleUserInput(
                caption = stringResource(R.string.input_select_location),
                vectorImageId = R.drawable.ic_restaurant
            )
        }
    }
}

@Composable
private fun CraneSearch(
    columns: Int,
    content: LazyGridScope.() -> Unit
) {
    // Display Crane search UI using LazyVerticalGrid
    LazyVerticalGrid(
        modifier = Modifier.padding(start = 24.dp, top = 0.dp, end = 24.dp, bottom = 12.dp),
        columns = GridCells.Fixed(columns),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        content = content
    )
}
