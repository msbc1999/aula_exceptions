package produto

class ProdutoCombo(var produtoNome: String) : Produto {

    var combo: MutableList<Produto> = mutableListOf<Produto>()

    override fun getNome(): String = produtoNome

    override fun getValor(): Double {
        var total = 0.0
        combo.forEach { total += it.getValor() }
        return total
    }

}