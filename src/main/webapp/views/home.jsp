<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <link
      rel="stylesheet"
      type="text/css"
      href="resources/css/bootstrap.min.css"
    />
    <link rel="stylesheet" type="text/css" href="views/css/home.css" />
    <script
      type="text/javascript"
      src="resources/js/jquery-3.2.1.min.js"
    ></script>
    <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    <title>Home - Healthtrack</title>
  </head>
  <body>
    <div class="wrapper">
      <div class="sidebar">
        <div class="sidebar-header">
          <div class="initials-icon">
            <label id="initials" class="initials">MB</label>
          </div>
          <label id="full-name">Marcelo Bicudo</label>
        </div>
        <hr class="solid" />
        <ul class="sidebar-nav">
          <li><a href="#">Home</a></li>
          <li><a href="#">Treino</a></li>
          <li><a href="#">Sair</a></li>
        </ul>
      </div>

      <div class="page-content">
        <h2>Dados Gerais</h2>
        <div class="data-container">
          <div class="container">
            <div class="row">
              <div class="col-4">
                <h6>Nome:</h6>
                <p>Nome compleo</p>
              </div>

              <div class="col-4">
                <h6>E-mail:</h6>
                <p>Nome compleo</p>
              </div>
            </div>

            <div class="row">
              <div class="col-4">
                <h6>Altura:</h6>
                <p>Nome compleo</p>
              </div>

              <div class="col-4">
                <h6>Data nascimento:</h6>
                <p>Nome compleo</p>
              </div>
            </div>
          </div>
          <div>
            <button
              type="button"
              class="btn btn-primary me-md-2"
              data-bs-toggle="modal"
              id="btn-edit"
              data-bs-target="#usuarioModal"
              type="button"
            >
              <i class="fa fa-edit"></i>
              Editar
            </button>
            <!-- Modal Usuario -->
            <div
              class="modal fade"
              id="usuarioModal"
              tabindex="-1"
              aria-labelledby="usuarioModalLabel"
              aria-hidden="true"
            >
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h5 class="modal-title" id="usuarioModalLabel">
                      Edição de usuario
                    </h5>

                    <button
                      type="button"
                      class="btn-close"
                      data-bs-dismiss="modal"
                      aria-label="Close"
                    ></button>
                  </div>
                  <div class="modal-body">
                    <div class="row">
                      <div class="col mb-3">
                        <label for="nomeUsuarioModalForm" class="form-label"
                          >Nome</label
                        >
                        <input
                          type="text"
                          class="form-control"
                          id="nomeUsuarioModalForm"
                          placeholder="name"
                        />
                      </div>
                      <div class="col mb-3">
                        <label for="emailUsuarioModalForm" class="form-label"
                          >Email
                        </label>
                        <input
                          type="email"
                          class="form-control"
                          id="emailUsuarioModalForm"
                          placeholder="name@email.com"
                        />
                      </div>
                    </div>
                    <div class="row">
                      <div class="col mb-3">
                        <label for="dataUsuarioModalForm" class="form-label"
                          >Data de nascimento</label
                        >
                        <input
                          type="date"
                          class="form-control"
                          id="dataUsuarioModalForm"
                          placeholder="name@example.com"
                        />
                      </div>
                      <div class="col mb-3">
                        <label for="exampleFormControlInput1" class="form-label"
                          >Altura</label
                        >
                        <input
                          min="0"
                          type="number"
                          oninput="validity.valid||(value='');"
                          class="form-control"
                          id="exampleFormControlInput1"
                          placeholder="name@example.com"
                        />
                      </div>
                    </div>
                  </div>
                  <div class="modal-footer">
                    <button
                      type="button"
                      class="btn btn-secondary"
                      data-bs-dismiss="modal"
                    >
                      Fechar
                    </button>
                    <button type="button" class="btn btn-primary">
                      Salvar
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="container-tables">
        <div>
          <table class="table">
            <thead class="table-dark">
              <tr>
                <th scope="col">Ações</th>
                <th scope="col">Data</th>
                <th scope="col">Alimento</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">
                  <button class="btn" id="btn-table-trash">
                    <i class="fa fa-trash"></i>
                  </button>
                  <button class="btn" id="btn-table-edit">
                    <i class="fa fa-edit"></i>
                  </button>
                </th>
                <td>Mark</td>
                <td>Otto</td>
              </tr>
              <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </body>
</html>
