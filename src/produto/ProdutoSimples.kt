package produto

class ProdutoSimples(var produtoNome: String, var produtoValor: Double) : Produto {

    init {
        if (produtoValor <= 0 ) throw Exception("O valor do produto deve ser maior que zero!")
    }

    override fun getNome(): String = produtoNome

    override fun getValor(): Double = produtoValor


}