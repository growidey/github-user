package com.dheaninda.part1.data

data class DetailUserResponse(
    val login: String,
    val id: Int,
    val avatar_url: String,
    val followers_url: String,
    val following_url: String,
    val company: String,
    val location: String,
    val reposUrl: String,
    val name: String,
    val followers: Int,
    val following: Int,
    val public_repos: Int
)
