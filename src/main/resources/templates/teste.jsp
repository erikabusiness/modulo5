<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">ID do usuario</th>
						<th scope="col">ID do destino</th>
						<th scope="col">ID do pacote</th>
						<th scope="col">Data do checkin</th>
						<th scope="col">Data do check Out</th>
						<th scope="col">Status da reserva</th>
						<th scope="col">Ações</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${reservas}" var="r">
						<tr>
							<th scope="row">${r.idReserva}</th>
							<td>${r.usuario}</td>
							<td>${r.destinos}</td>
							<td>${r.pacotes}</td>
							<td>${r.dtCheckIn}</td>
							<td>${r.dtCheckout}</td>
							<td>${r.statusReserva}</td>
							<td><a href="#" class="btn btn-warning"
								data-bs-toggle="modal"
								data-bs-target="#atualizarModal${r.idReserva}">Editar</a>

								<button class="btn btn-danger" data-bs-toggle="modal"
									data-bs-target="#excluirModal${r.idReserva }">Excluir</button></td>
						</tr>
						<div class="modal fade" id="excluirModal${r.idReserva }"
							tabindex="-1" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title">Deseja excluir?</h5>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal" aria-label="Close"></button>
									</div>
									<div class="modal-body">
										
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-secondary"
											data-bs-dismiss="modal">Close</button>
										<a href="/tde/destinos-delete?id=${r.idReserva}"
											class="btn btn-danger">Excluir</a>
									</div>
								</div>
							</div>
						</div>

						<!--incio Modal -->

						<div class="modal fade" id="atualizarModal${r.idReserva}"
							tabindex="-1" aria-labelledby="exampleModalLabel"
							aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h1 class="modal-title fs-5" id="exampleModalLabel">Cadastro</h1>
										<button type="button" class="btn-close"
											data-bs-dismiss="modal" aria-label="Close"></button>
									</div>

									<!-- body modal -->
									<div class="modal-body">

										<form action="/tde/reserva-save">
											<input type="text" id="idReserva" name="idReserva"
												class="form-control" value="${r.idReserva}" hidden>
											<div class="form-group mb-2 ">
												<label for="name">Nome do destino</label> <input type="text" id="nome"
													name="nome" class="form-control" value="${r.destinos}">
											</div>
											<div class="form-group mb-2 ">
												<label for="avaliacao">Avaliação</label> <input type="text"
													id="avaliacao" name="avaliacao" class="form-control"
													value="">
											</div>

											<div class="modal-footer">
												<button type="button" class="btn btn-secondary"
													data-bs-dismiss="modal">Cancelar</button>
												<button type="submit" class="btn btn-primary">Save</button>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>

						<!--  fim modal -->


					</c:forEach>
				</tbody>
			</table>
			</div>
</body>
</html>