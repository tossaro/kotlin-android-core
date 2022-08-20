package com.domain.example.domain.stock.usecase

import com.domain.example.domain.stock.StockRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetStocksLocalUseCase: KoinComponent {
    private val stockRepository: StockRepository by inject()
    suspend operator fun invoke(offset: Int, limit: Int) = stockRepository.getStocksLocal(offset, limit)
}