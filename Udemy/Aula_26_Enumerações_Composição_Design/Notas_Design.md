## Categorias de Classes em Sistemas Orientados a Objetos
- Em um sistema orientado a objetos, de modo geral **"tudo" é objeto**.  
- Para melhorar **organização**, **flexibilidade**, **reuso** e **delegação**, as classes podem ser divididas nas seguintes categorias:


## 1. Controllers
- **O que são:** Classes que recebem pedidos (requisições) e decidem o que fazer com eles.
- **Função:** Agir como "maestros" que coordenam a comunicação entre as outras partes do sistema.
- **Exemplo:** Em um site, quando o usuário clica em "login", o controller pega esses dados, envia para o service para validar e depois manda o resultado para a view.

---

## 2. Entities
- **O que são:** Classes que representam os elementos principais do sistema.
- **Função:** Guardar dados e, às vezes, regras básicas sobre esses dados.
- **Exemplo:** Em um sistema bancário, uma `Conta` seria uma entidade com atributos como `numero`, `saldo` e `titular`.

---

## 3. Services
- **O que são:** Classes que contêm a lógica de negócio.
- **Função:** Processar os dados recebidos, aplicar regras e executar ações importantes.
- **Exemplo:** Em um serviço de vendas, um `PedidoService` pode calcular o valor total de um pedido com descontos e impostos.

---

## 4. Views
- **O que são:** Classes ou arquivos que cuidam da **apresentação**.
- **Função:** Mostrar as informações ao usuário de forma amigável.
- **Exemplo:** Em um aplicativo, a tela que exibe o saldo bancário é parte da view.

---

## 5. Repositories
- **O que são:** Classes que conversam diretamente com o banco de dados ou outra forma de armazenamento.
- **Função:** Salvar, buscar, atualizar ou excluir dados.
- **Exemplo:** Um `UsuarioRepository` pode ter métodos como `buscarPorId(id)` ou `salvar(usuario)`.

---


