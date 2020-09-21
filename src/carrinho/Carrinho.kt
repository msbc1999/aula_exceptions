package carrinho

import produto.Produto

class Carrinho(var produtos: MutableList<Produto>) {

    fun valorTotal(){
        var somaTotal = 0.0
        produtos.forEach(){
            somaTotal += it.getValor()
        }
        println("O valor total do carrinho é R$$somaTotal")
    }
}
