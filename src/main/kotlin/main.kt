import kotlin.math.roundToInt

fun main() {
    val previousSum = 10_002
    val buyingSum = 399.00
    val isMeloman = true
    val discount = if (previousSum >= 10_001) buyingSum * 0.05 else if (previousSum in 1001..10000) 100.00 else 0.00
    val sumWithDiscount = if (buyingSum - discount > 0) buyingSum - discount else 0.00
    val result = (if (isMeloman) sumWithDiscount * 99 else sumWithDiscount * 100)

    println("Сумма покупки с учетом всех скидок: ${(result / 100).toInt()} руб. ${(result % 100).roundToInt().toInt()} коп.")
}
