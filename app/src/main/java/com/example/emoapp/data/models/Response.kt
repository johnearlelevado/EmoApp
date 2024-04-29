package com.example.emoapp.data.models

data class Response (
    val levels: List<Level>,
)

data class Level(
    val level: String,
    val title: String,
    val description: String,
    val state: String,
    val activities: List<Activity>,
)

data class Activity(
    val id: String,
    val challengeId: String,
    val type: String,
    val title: String,
    val titleB: String?,
    val description: String,
    val descriptionB: Any?,
    val state: String,
    val icon: Icon,
    val lockedIcon: LockedIcon,
)

data class Icon(
    val file: File,
    val title: String,
    val description: String,
)

data class File(
    val url: String,
    val details: Details,
    val fileName: String,
    val contentType: String,
)

data class Details(
    val size: Long,
)

data class LockedIcon(
    val file: File2,
    val title: String,
    val description: String,
)

data class File2(
    val url: String,
    val details: Details2,
    val fileName: String,
    val contentType: String,
)

data class Details2(
    val size: Long,
)
