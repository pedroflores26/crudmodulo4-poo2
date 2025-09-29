# 📌 Projeto CRUD em Java (Cliente + Usuário)

Este projeto é um exemplo didático de aplicação **Java Desktop (Swing)** com 2 módulos CRUD:

- **Usuário** (com autenticação via BCrypt)
- **Cliente**

---

## 🔄 Fluxo principal do sistema
1. **LoginView** → autenticação de usuário.  
2. **MenuPrincipalView** → menu com acesso aos módulos.  
3. **UsuarioView** → cadastro e gerenciamento de usuários.  
4. **ClienteView** → cadastro e gerenciamento de clientes.  

---

## 🚀 Tecnologias utilizadas
- Java 8+
- Swing (Java Desktop)
- MySQL
- JDBC
- jBCrypt (hash seguro de senhas)

---

## 📂 Estrutura do projeto

src/br/ulbra/
├─ dao/ → Classes DAO (UsuarioDAO, ClienteDAO, etc.)
├─ controller/ → Regras de negócio (UsuarioController, ClienteController)
├─ model/ → Modelos (Usuario.java, Cliente.java)
├─ view/ → Interfaces gráficas (LoginView, MenuPrincipalView, UsuarioView, ClienteView)
└─ img/ → Ícones

yaml
Copiar código

---

## ⚙️ Configuração do ambiente
1. Instale o **Java JDK 8+**.  
2. Instale o **MySQL** e configure um banco de dados chamado `bdaulabanco`.  
3. Importe o projeto na sua IDE (**NetBeans recomendado**).  
4. Adicione as dependências:  
   - **MySQL Connector/J**  
   - **jBCrypt**  

📥 Baixar jBCrypt: [Repositório Maven](https://mvnrepository.com/artifact/org.mindrot/jbcrypt)  

---

## 🗄️ Banco de dados
Crie o schema e tabelas no MySQL:

```sql
CREATE DATABASE IF NOT EXISTS bdaulabanco;
USE bdaulabanco;

CREATE TABLE tbusuario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  login VARCHAR(100) NOT NULL UNIQUE,
  senha VARCHAR(225) NOT NULL,
  nome VARCHAR(150),
  ativo TINYINT(1) DEFAULT 1
);

CREATE TABLE tbcliente (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(200),
  telefone VARCHAR(15)
);
👤 Criando o primeiro usuário (ADM)
Opção 1 — Gerar hash manual
Use esta classe para gerar o hash:

java
Copiar código
import org.mindrot.jbcrypt.BCrypt;

public class HashGenerator {
    public static void main(String[] args) {
        System.out.println(BCrypt.hashpw("admin123", BCrypt.gensalt()));
    }
}
Depois insira no banco:

sql
Copiar código
INSERT INTO tbusuario (login, senha, nome, ativo)
VALUES ('adm', '$2a$10$HASHGERADO...', 'Administrador', 1);
Opção 2 — Criar automaticamente no código
No LoginView, antes de abrir a tela de login, verifique se há usuários.
Caso não exista, crie automaticamente o administrador:

java
Copiar código
UsuarioDAO dao = new UsuarioDAO();
if (dao.countUsuarios() == 0) {
    String hash = BCrypt.hashpw("admin123", BCrypt.gensalt());
    dao.insert(new Usuario("adm", hash, "Administrador", true));
}
▶️ Execução
Rode o projeto (LoginView é a classe principal).

Login padrão de exemplo:

Usuário: pedro

Senha: pedro

Após autenticação, o sistema abre o MenuPrincipalView.

🔒 Segurança
As senhas são armazenadas com BCrypt (não em texto puro).

Recomenda-se usar um usuário MySQL dedicado apenas para esta aplicação.
