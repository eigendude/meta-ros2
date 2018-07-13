DESCRIPTION = "ROS Package Tool"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake-modules ${PYTHON_PN}-rospkg-native libtinyxml"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz \
           file://0001-Replaced-references-to-deprecated-Boost.TR1.patch \
           "
SRC_URI[md5sum] = "28db19964957b9d2f45ffce6308cf52d"
SRC_URI[sha256sum] = "5d8c8170b2c240cc5cd333dc2dd97b39162d9be0a6f317904d859672ca75e59e"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-rosdep \
                  ${@'python-subprocess' if d.getVar('PYTHON_PN', True) == 'python' else ''}"
