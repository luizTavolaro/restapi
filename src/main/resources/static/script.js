// ------------------------------------------------------- //
// ----------------------- Produto ----------------------- //
// ------------------------------------------------------- //

function listarProdutos(){
    fetch('/api/produtos' ,{
        method: 'GET',
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function listarProdutoPorId(id){
    fetch(`/api/produtos/${id}` ,{
        method: 'GET',
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function listarProdutoPelaMarca(marca){
    fetch(`/api/produtos/marca?marca=${marca}` ,{
        method: 'GET',
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function criarProduto(descricao, marca, valor){
    fetch(`/api/produtos/` ,{
        method: 'POST',
        body: JSON.stringify({
            "descricao": descricao, 
            "marca": marca, 
            "valor": valor
        }),
        headers: { 'Content-type': 'application/json' }
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function alteraProduto(id, descricao, marca, valor){
    fetch(`/api/produtos/${id}` ,{
        method: 'PUT',
        body: JSON.stringify({
            "id": id,
            "descricao": descricao, 
            "marca": marca, 
            "valor": valor
        }),
        headers: { 'Content-type': 'application/json' }
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function apagarProduto(id){
    fetch(`/api/produtos/${id}` ,{
        method: 'DELETE',
        headers: { 'Content-type': 'application/json' }
    })
}

// ---------------------------------------------------- //
// ----------------------- Time ----------------------- //
// ---------------------------------------------------- //

function listarTimes(){
    fetch('/api/times' ,{
        method: 'GET',
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function listarTimePorId(id){
    fetch(`/api/times/${id}` ,{
        method: 'GET',
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function criarTime(anoFundacao, nome, cidade, estado){
    fetch(`/api/times/` ,{
        method: 'POST',
        body: JSON.stringify({
            "anoFundacao": anoFundacao, 
            "nome": nome, 
            "cidade": cidade, 
            "estado": estado
        }),
        headers: { 'Content-type': 'application/json' }
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function alteraTime(id, anoFundacao, nome, cidade, estado){
    fetch(`/api/times/${id}` ,{
        method: 'PUT',
        body: JSON.stringify({
            "id": id,
            "anoFundacao": anoFundacao, 
            "nome": nome, 
            "cidade": cidade, 
            "estado": estado
        }),
        headers: { 'Content-type': 'application/json' }
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function apagarTime(id){
    fetch(`/api/times/${id}` ,{
        method: 'DELETE',
        headers: { 'Content-type': 'application/json' }
    })
}

// ---------------------------------------------------------- //
// ----------------------- Aplicativo ----------------------- //
// ---------------------------------------------------------- //

function listarAplicativos(){
    fetch('/api/aplicativos' ,{
        method: 'GET',
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function listarAplicativoPorId(id){
    fetch(`/api/aplicativos/${id}` ,{
        method: 'GET',
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function criarAplicativo(nome, desenvolvedor, downloads){
    fetch(`/api/aplicativos/` ,{
        method: 'POST',
        body: JSON.stringify({
            "nome": nome, 
            "desenvolvedor": desenvolvedor, 
            "downloads": downloads
        }),
        headers: { 'Content-type': 'application/json' }
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function alteraAplicativo(id, nome, desenvolvedor, downloads){
    fetch(`/api/aplicativos/${id}` ,{
        method: 'PUT',
        body: JSON.stringify({
            "id": id,
            "nome": nome, 
            "desenvolvedor": desenvolvedor, 
            "downloads": downloads
        }),
        headers: { 'Content-type': 'application/json' }
    })
    .then(resposta => resposta.json())
    .then(j => console.log(j));
}

function apagarAplicativo(id){
    fetch(`/api/aplicativos/${id}` ,{
        method: 'DELETE',
        headers: { 'Content-type': 'application/json' }
    })
}