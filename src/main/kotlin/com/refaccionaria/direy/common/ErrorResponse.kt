package com.refaccionaria.direy.common

import org.springframework.http.HttpStatus

data class ErrorResponse(val status: Int, val error: HttpStatus, val message: String?)
