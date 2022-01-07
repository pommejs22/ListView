package com.example.training2

import java.io.Serializable

data class Onepiece(
    var imageId: Int, // アイコン /
    var title: String, // 名言
    var name: String, // 名前
) : Serializable
