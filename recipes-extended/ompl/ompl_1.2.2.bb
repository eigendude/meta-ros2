DESCRIPTION = "The Open Motion Planning Library (OMPL) consists of a set of sampling-based motion planning algorithms."
HOMEPAGE = "http://ompl.kavrakilab.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=923f436234988118e9a042c42a64323c"

DEPENDS = "boost libeigen"

SRC_URI = "https://github.com/ompl/ompl/archive/${PV}.tar.gz;downloadfilename=${P}.tar.gz"
SRC_URI[md5sum] = "1250a3faaa0e8a191d1e304750202b13"
SRC_URI[sha256sum] = "9e80279e6fefce9a2209cb1470d1c8cf627e9f4c01ef0990a100fb857ce06a21"

SRC_URI += "file://0001-address-gcc6-build-error.patch"
SRC_URI += "file://0002-Add-option-to-skip-setting-RPATH.patch"
SRC_URI += "file://0003-fix-for-gcc6.-see-issue-345.patch"

S = "${WORKDIR}/ompl-${PV}"

inherit cmake

EXTRA_OECMAKE = "-DOMPL_SKIP_RPATH=ON"
