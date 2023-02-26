package com.example.githubusersapp.data.model

import com.google.gson.annotations.SerializedName

data class ResponseUsers(
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean?, // false
    @SerializedName("items")
    val items: List<Item>?,
    @SerializedName("total_count")
    val totalCount: Int? // 1
) {
    data class Item(
        @SerializedName("avatar_url")
        val avatarUrl: String?, // https://avatars.githubusercontent.com/u/103646893?v=4
        @SerializedName("events_url")
        val eventsUrl: String?, // https://api.github.com/users/hossein69ameri/events{/privacy}
        @SerializedName("followers_url")
        val followersUrl: String?, // https://api.github.com/users/hossein69ameri/followers
        @SerializedName("following_url")
        val followingUrl: String?, // https://api.github.com/users/hossein69ameri/following{/other_user}
        @SerializedName("gists_url")
        val gistsUrl: String?, // https://api.github.com/users/hossein69ameri/gists{/gist_id}
        @SerializedName("gravatar_id")
        val gravatarId: String?,
        @SerializedName("html_url")
        val htmlUrl: String?, // https://github.com/hossein69ameri
        @SerializedName("id")
        val id: Int?, // 103646893
        @SerializedName("login")
        val login: String?, // hossein69ameri
        @SerializedName("node_id")
        val nodeId: String?, // U_kgDOBi2GrQ
        @SerializedName("organizations_url")
        val organizationsUrl: String?, // https://api.github.com/users/hossein69ameri/orgs
        @SerializedName("received_events_url")
        val receivedEventsUrl: String?, // https://api.github.com/users/hossein69ameri/received_events
        @SerializedName("repos_url")
        val reposUrl: String?, // https://api.github.com/users/hossein69ameri/repos
        @SerializedName("score")
        val score: Double?, // 1.0
        @SerializedName("site_admin")
        val siteAdmin: Boolean?, // false
        @SerializedName("starred_url")
        val starredUrl: String?, // https://api.github.com/users/hossein69ameri/starred{/owner}{/repo}
        @SerializedName("subscriptions_url")
        val subscriptionsUrl: String?, // https://api.github.com/users/hossein69ameri/subscriptions
        @SerializedName("type")
        val type: String?, // User
        @SerializedName("url")
        val url: String? // https://api.github.com/users/hossein69ameri
    )
}
