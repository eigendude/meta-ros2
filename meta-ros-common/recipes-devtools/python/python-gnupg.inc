# Copyright (c) 2019 LG Electronics, Inc.

SUMMARY  = "A wrapper for the Gnu Privacy Guard (GPG or GnuPG)"
HOMEPAGE = "https://bitbucket.org/vinay.sajip/python-gnupg/src/default/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b0b7ac63b60085b23fa9f7e1951daa1d"

SRC_URI[md5sum] = "2f25c27c98b33335b7e4e64c90ac9276"
SRC_URI[sha256sum] = "2d158dfc6b54927752b945ebe57e6a0c45da27747fa3b9ae66eccc0d2147ac0d"

DEPENDS += "gnupg"

PYPI_PACKAGE = "python-gnupg"

inherit pypi
