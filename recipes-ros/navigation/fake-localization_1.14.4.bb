DESCRIPTION = "A ROS node that simply forwards odometry information."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles roscpp rosconsole nav-msgs geometry-msgs message-filters rospy tf2-geometry-msgs tf2-ros"

require navigation.inc
