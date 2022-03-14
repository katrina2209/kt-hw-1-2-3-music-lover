fun main() {
    val previousSum = 10_000
    val buyingSum = 300
    val isMeloman = true
    val sumWithDiscount = if (previousSum <= 1_000) buyingSum else if (previousSum >= 10_001) buyingSum * 95 / 100 else if (buyingSum - 100 > 0) buyingSum - 100 else 0
    val result = if (isMeloman) sumWithDiscount * 99 / 100 else sumWithDiscount

    println("Сумма покупки с учетом всех скидок: $result")
}