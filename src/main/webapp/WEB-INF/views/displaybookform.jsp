<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Book form</title>
<style>
body {
	display: flex;
	flex-direction: row;
	justify-content: center;
	align-items: center;
	height: 100vh; /* Full viewport height */
	margin: 0; /* Remove default margin */
}

h2 {
	margin: 0; /* Remove default margin for proper centering */
}
</style>
</head>
<body>
	<form action="processBookRequest">
		<label for="bookname">Name: </label> <input type="text" name="bookname" id="bookname"
			placeholder="enter the book name here" /> <input type="submit"
			value="Order Book" />
	</form>
</body>
</html>
