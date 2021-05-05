# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Makes it possible to run the ros_ethercat_loop without using sudo. Forked from pr2-grant"
AUTHOR = "Shadow Robot's software team <software@shadowrobot.com>"
ROS_AUTHOR = "Ugo Cupcic <software@shadowrobot.com>"
HOMEPAGE = "http://www.shadowrobot.com/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ethercat_grant"
ROS_BPN = "ethercat_grant"

ROS_BUILD_DEPENDS = " \
    libcap \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libcap \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/shadow-robot/ethercat_grant-release/archive/release/noetic/ethercat_grant/0.2.5-3.tar.gz
ROS_BRANCH ?= "branch=release/noetic/ethercat_grant"
SRC_URI = "git://github.com/shadow-robot/ethercat_grant-release;${ROS_BRANCH};protocol=https"
SRCREV = "2231f6c76605df9bef6010044de0c3625bb13fa3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
