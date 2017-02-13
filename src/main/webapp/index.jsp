<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
	font-family: sans-serif;
}

h1 {
	text-align: center;
}
</style>
</head>
<body>
	<h1>Spring-Camel project</h1>
	<table>
		<thead>
			<tr>
				<th>Functions</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>
					<ul>
						<li><a href="/spring/ping">Text example 'ping'</a></li>
						<li><a href="/spring/json">Json example (returns JSON)</a></li>
						<li><a href="/services/ping">Camel text example 'ping'</a></li>
					</ul>
				</td>
			</tr>
		</tbody>
	</table>

</body>
</body>
</html>
