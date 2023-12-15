export const Select = () => {
	const links = [
		{
			nome: 'Usuario'
		},
		{
			nome: 'Destinos'
		},
		{
			nome: 'Reserva'
		},
	]
	let options = []
	
	links.map(({nome}) => {
		options.push(`
		<option value="/${nome.toLowerCase()}">${nome}</option>
		`)
	})
	
	options = options.join(' ')
	
	return `
		<select id="routes" class="mb-2">
		<option selected disabled>Escolha uma lista</option>
		${options}
		</select>
	`
		}