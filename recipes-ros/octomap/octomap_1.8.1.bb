DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach, providing data structures and mapping algorithms in C++."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9b0e1f01a68f441eeaf7b5e18812d3c8"

SRC_URI = "https://github.com/OctoMap/${BPN}/archive/v${PV}.tar.gz;downloadfilename=${BP}.tar.gz \
           file://0001-Improve-the-generation-of-config.cmake-and-version.c.patch \
           "
SRC_URI[md5sum] = "164d1a5376e6da89a2159c7444facdac"
SRC_URI[sha256sum] = "8b18ef7693e87f1400b9a8bc41f86e3b28259ac98c0b458037232652380aa6af"

S = "${WORKDIR}/${BP}/${BPN}"

EXTRA_OECMAKE += "-DCMAKE_SKIP_RPATH=ON"

inherit cmake
