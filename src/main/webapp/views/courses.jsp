<h2>Courses</h2>
<c:forEach var="c" items="${courses}">
  <p>${c}
  <form action="register/${c}" method="post"><button>Register</button></form>
  </p>
</c:forEach>