/*
Copyright (c) 2009 Larry Moore, larmoor@gmail.com
              2014 Mike Adair, Richard Greenwood, Didier Richard, Stephen Irons, Olivier Terral and
                   Calvin Metcalf (proj4js)
              2018 Codice Foundation

Released under The MIT License; see
http://www.opensource.org/licenses/mit-license.php
or http://en.wikipedia.org/wiki/MIT_License
*/
// Default package
data class Usng(
    val zoneNumber: Int,
    val latitudeBandLetter: String,
    val columnLetter: String? = null,
    val rowLetter: String? = null,
    val easting: Int? = null,
    val northing: Int? = null
)