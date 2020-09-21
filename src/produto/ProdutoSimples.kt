package produto

class ProdutoSimples(var produtoNome: String, var produtoValor: Double) : Produto {
    override fun getNome(): String = produtoNome

    override fun getValor(): Double = produtoValor


}