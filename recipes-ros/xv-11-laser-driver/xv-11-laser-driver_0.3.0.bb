DESCRIPTION = "Neato XV-11 Laser Driver. This driver works with the laser when it is removed \
from the XV-11 Robot as opposed to reading scans from the Neato's USB port."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs roscpp boost"

SRC_URI = "https://github.com/rohbotics/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b1b7f0e49d693f9932ef3fdb96906486"
SRC_URI[sha256sum] = "875a82a0371a5e86ca9159b5713e7658d3c130104241e0be97160ba3e2fcd46d"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
