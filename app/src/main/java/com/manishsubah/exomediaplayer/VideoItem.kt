package com.manishsubah.exomediaplayer

import android.net.Uri
import androidx.media3.common.MediaItem

data class VideoItem(
    val contentUri: Uri,
    val mediaItem: MediaItem,
    val name: String
)
