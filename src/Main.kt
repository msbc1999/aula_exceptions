import carrinho.Carrinho
import produto.ProdutoCombo
import produto.ProdutoSimples

fun main() {
    val hamburguerCarne = ProdutoSimples("hamburguer de carne bovina", 10.00)
    val hamburguerFrango = ProdutoSimples("hamburguer de frango", 12.00)
    val refrigeranteMédio = ProdutoSimples("refrigerante médio", 6.00)
    val refrigeranteGrande = ProdutoSimples("refrigerante grande", 8.00)
    val batataMedia = ProdutoSimples("batata frita média", 5.00)
    val batataGrande = ProdutoSimples("batata frita grande", 7.00)

    val combo1 = ProdutoCombo("combo 1", 22.00)

    combo1.combo = listOf(hamburguerCarne, refrigeranteMédio, batataMedia)

    val combo2 = ProdutoCombo("combo 2", 24.00)

    combo2.combo = listOf(hamburguerFrango, refrigeranteMédio, batataMedia)

    val carrinho1 = Carrinho(mutableListOf(combo1, batataGrande))

    carrinho1.valorTotal()
}