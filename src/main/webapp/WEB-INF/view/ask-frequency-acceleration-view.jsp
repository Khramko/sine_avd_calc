<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2> Please enter frequency, measured acceleration and choose acceleration, velocity, displacement units. </h2>
<br>
<br>
<form:form action = "showDisplacement" modelAttribute="initialData">
    Frequency, Hz <form:input path="frequency"/>
    <br><br><br>
    Acceleration &ensp;<form:input path="acceleration"/>
    <br><br><br>
    Acceleration unit &ensp;&ensp;<form:select path="accelerationUnit">
    <form:option value="9.78" label="g"/>
    <form:option value="1" label="m/s2"/>
</form:select>

    <br><br><br>
    Velocity unit &ensp;&ensp;&ensp;&ensp;&ensp;<form:select path="velocityUnit">
    <form:option value="mm/s" label="mm/s"/>
    <form:option value="m/s" label="m/s"/>
</form:select>
    <br><br><br>
    Displacement unit &ensp;<form:select path="displacementUnit">
        <form:option value="mm" label="mm"/>
        <form:option value="m" label="m"/>
    </form:select>
    <br><br><br>

    &ensp;<input type="submit" value="OK">


</form:form>

</body>
</html>