<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                xmlns:pay="http://www.servicios.co/pagos/schemas">
    <xsl:output method="xml" indent="yes"/>

    <!-- Ejemplo de transformación -->
    <xsl:template match="/">
        <html>
            <body>
                <h2>Factura Información</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th>Referencia Factura</th>
                        <th>Total Pagar</th>
                    </tr>
                    <xsl:for-each select="pay:ResultadoConsulta">
                        <tr>
                            <td><xsl:value-of select="pay:referenciaFactura/pay:referenciaFactura"/></td>
                            <td><xsl:value-of select="pay:totalPagar"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
