# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The dijkstra_mesh_planner package"
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
ROS_AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD-3"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=ba717dc718040ac1636f383eca24f11f"

ROS_CN = "mesh_navigation"
ROS_BPN = "dijkstra_mesh_planner"

ROS_BUILD_DEPENDS = " \
    mbf-mesh-core \
    mbf-utility \
    mesh-map \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    mbf-mesh-core \
    mbf-utility \
    mesh-map \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mbf-mesh-core \
    mbf-utility \
    mesh-map \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/mesh_navigation-release/archive/release/melodic/dijkstra_mesh_planner/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/dijkstra_mesh_planner"
SRC_URI = "git://github.com/uos-gbp/mesh_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "2a7e9da82e8bb98e44aef73743f10c92663dc9ec"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
