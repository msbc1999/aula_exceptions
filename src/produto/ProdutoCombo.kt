package produto

class ProdutoCombo(var produtoNome: String, var valorTotal: Double) : Produto {

    var combo: List<Produto> = mutableListOf<Produto>()

    override fun getNome(): String = produtoNome

    fun getSomaProdutosNoCombo(): Double {
        var total = 0.0
        combo.forEach { total += it.getValor() }
        return total
    }

    override fun getValor(): Double = valorTotal

}