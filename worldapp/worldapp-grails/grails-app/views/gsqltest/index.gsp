<html>
<body>
    <g:if test="{not empty results}">
        <h3>Countries</h3>
        <ul>
            <g:each in="${results}" var="country">
                <li>${country.name}</li>                                
            </g:each>
        </ul>

    </g:if>
    <g:else>
        <h3>No countries found</h3>
        <p>This is probably an issue.</p>
    </g:else>
</body>
</html>