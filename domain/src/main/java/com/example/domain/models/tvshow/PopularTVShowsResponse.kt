package com.example.domain.models.tvshow


data class PopularTVShowsResponse(
    val page: Int?,
    val results: List<Result>?,
    val total_pages: Int?,
    val total_results: Int?
)