<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2> Please enter frequency, measured acceleration and choose acceleration, velocity, displacement units.
<br>
Push "OK" button to submit.</h2>
<br><br><br>
<form:form action = "showResult" modelAttribute="sineForm">
    Frequency, Hz <form:input path="frequency"/>
    <form:errors path="frequency"/>
    <br><br><br>
    Acceleration &ensp;<form:input path="acceleration"/>
    <br><br><br>
    Acceleration unit &ensp;&ensp;<form:select path="accelerationUnitCoefficient">
    <form:options items="${sineForm.accelerationUnits}"/>

</form:select>

    <br><br><br>
    Velocity unit &ensp;&ensp;&ensp;&ensp;&ensp;<form:select path="velocityUnitCoefficient">
    <form:options items="${sineForm.velocityUnits}"/>

</form:select>
    <br><br><br>
    Displacement unit &ensp;<form:select path="displacementUnitCoefficient">
    <form:options items="${sineForm.displacementUnits}"/>
    </form:select>
    <br><br><br>

    &ensp;<input type="submit" value="OK">


</form:form>

</body>
</html>