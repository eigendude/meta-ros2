DESCRIPTION = "C++ implementation of Lie Groups using Eigen."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8f78120fdd8782ba44f0f9cd9a4a393b"

DEPENDS = "libeigen"

SRC_URI = "https://github.com/stonier/sophus/archive/${PV}.tar.gz;;downloadfilename=${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "57842cc123b9ab6d7307e3c1962812de"
SRC_URI[sha256sum] = "1b3785417ce65753728d8b9096f2fae79c5eb85a3b5845ab76e19d6244c886a1"

S = "${WORKDIR}/sophus-${PV}"

inherit cmake

# CXXFLAGS are needed to compile eigen 3.3.1 headers properly
#CXXFLAGS += "-Wno-deprecated-declarations -Wno-misleading-indentation -Wno-int-in-bool-context -Wno-ignored-attributes"

do_install_append() {
        # remove sysroot library path from cmake config files
        sed -i -e 's#${STAGING_DIR_TARGET}##g' \
                   ${D}${datadir}/sophus/cmake/*.cmake
}
